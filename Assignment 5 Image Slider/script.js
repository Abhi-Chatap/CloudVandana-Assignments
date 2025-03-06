// Array of image URLs
const images = [
    "https://images.pexels.com/photos/34950/pexels-photo.jpg",
    "https://images.pexels.com/photos/414171/pexels-photo-414171.jpeg",
    "https://images.pexels.com/photos/1108099/pexels-photo-1108099.jpeg",
    "https://images.pexels.com/photos/355770/pexels-photo-355770.jpeg",
    "https://images.pexels.com/photos/102104/pexels-photo-102104.jpeg"
];

let currentIndex = 0;
let sliderImage = document.getElementById("sliderImage");
let autoSlide;

// Function to update the slider image
function updateImage() {
    sliderImage.style.opacity = "0"; // Fade out effect

    setTimeout(() => {
        sliderImage.src = images[currentIndex];
        sliderImage.style.opacity = "1"; // Fade in effect
    }, 300);
}

// Show the first image initially
window.onload = function () {
    sliderImage.src = images[currentIndex];
    startAutoSlide();
};

// Function to show the next image
function nextImage() {
    currentIndex = (currentIndex + 1) % images.length;
    updateImage();
    resetAutoSlide();
}

// Function to show the previous image
function prevImage() {
    currentIndex = (currentIndex - 1 + images.length) % images.length;
    updateImage();
    resetAutoSlide();
}

// Function to automatically switch images every 4 seconds
function startAutoSlide() {
    autoSlide = setInterval(() => {
        nextImage();
    }, 40000);
}

// Function to reset auto-slide when user interacts
function resetAutoSlide() {
    clearInterval(autoSlide);
    startAutoSlide();
}

// Pause auto-slide when hovering over the image
sliderImage.addEventListener("mouseenter", () => clearInterval(autoSlide));
sliderImage.addEventListener("mouseleave", () => startAutoSlide());
