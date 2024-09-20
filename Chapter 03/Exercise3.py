import sqlite3

# Function to retrieve user data from the database
def get_user_data(username):
    conn = sqlite3.connect('users.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE username = ?", (username,))
    user_data = cursor.fetchone()
    conn.close()
    return user_data

# Main function
def main():
    username = input("Enter your username: ")
    user_data = get_user_data(username)
    if user_data:
        print("Welcome, {}!".format(user_data[1]))
    else:
        print("Invalid username.")

# Call the main function
main()
