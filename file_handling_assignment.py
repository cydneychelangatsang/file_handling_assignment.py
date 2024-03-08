# File Creation
try:
    with open("my_file.txt", "w") as file:
        file.write("Hello, this is line 1.\n")
        file.write("123 is a number.\n")
        file.write("Writing to a file in Python.\n")
    print("File 'my_file.txt' created successfully.")
except Exception as e:
    print(f"Error creating file: {e}")

# File Reading and Display
try:
    with open("my_file.txt", "r") as file:
        content = file.read()
        print("\nContent of 'my_file.txt':\n")
        print(content)
except FileNotFoundError:
    print("Error: File 'my_file.txt' not found.")
except PermissionError:
    print("Error: Permission denied to read 'my_file.txt'.")
except Exception as e:
    print(f"Error reading file: {e}")

# File Appending
try:
    with open("my_file.txt", "a") as file:
        file.write("\nAppending a new line.\n")
        file.write("Additional content in append mode.\n")
        file.write("File append operation in Python.\n")
    print("\nFile 'my_file.txt' appended successfully.")
except Exception as e:
    print(f"Error appending to file: {e}")
finally:
    print("\nTask completed.")
