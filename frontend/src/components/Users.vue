<template>
    <div>
        <h2>User List </h2>
        <ul>
            <li v-for="user in users" :key="user">{{ user }}</li>
        </ul>

        <input v-model="newUser" placeholder="New user" />
        <button @click="addUser">Add User</button>
    </div>
</template>

<script setup>
import { ref, onMounted } from "vue";
import axios from "axios";

const users = ref([]);
const newUser = ref("");

onMounted(async () => {
    const res = await axios.get("http://localhost:8080/api/users");
    users.value = res.data;
});

async function addUser() {
    if (newUser.value.trim() === "") return;

    const res = await axios.post(
        "http://localhost:8080/api/users", newUser.value,
        { headers: { "Content-Type": "text/plain" } }
    );
    users.value = res.data;
    newUser.value = "";
}
</script>
