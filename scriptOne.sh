#!/bin/bash

# define your password here
PASSWORD="your_password"

# read user input for the username
read -p "Enter your username: " USERNAME

# hash the user input for the password
HASHED_PASSWORD=$(echo -n "$PASSWORD" | sha256sum | cut -d " " -f 1)

# use grep to check if the username and hashed password pair exists in the password file
if grep -q "^$USERNAME:$HASHED_PASSWORD" /etc/shadow; then
    echo "User verified"
else
    echo "User verification failed"
fi