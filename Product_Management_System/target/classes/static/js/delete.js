const apiUrl = "http://localhost:8085/api/product";

async function deleteProduct() {
    const id = document.getElementById("delete-id").value;
    const res = await fetch(`${apiUrl}/${id}`, {
        method: "DELETE",
    });

    // Get the message container
    const messageContainer = document.getElementById("message-container");

    if (res.ok) {
        messageContainer.textContent = "Product Deleted Successfully!";
        messageContainer.style.color = "green"; // Optional: Add color to the success message
    } else if (res.status === 404) {
        messageContainer.textContent = "Product not found";
        messageContainer.style.color = "red"; // Optional: Add color to the error message
    } else {
        messageContainer.textContent = "Failed to delete product";
        messageContainer.style.color = "red"; // Optional: Add color to the error message
    }
}
