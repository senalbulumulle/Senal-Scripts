/*******************************************
 * Clone-Senal.js
 * Written by Senal Bulumulle
 * 
 * 
 * 
 *******************************************/


// Make a function called senal()
// Use senal() to display the Senal Image
function senal() {
    document.write("<img src='./Image/senal.png' width='36'></img>");
}

// Make a function called clone()
function clone() {
    setInterval(senal, 2);
    console.log(clone);
}

// Make a function called space()
// Use space() to use the space.png image
function space() {

    document.write("<img src='./Image/space.png' width='36'></img>");
}

// Make a function called cloneTimer()
// Use cloneTimer() 
function cloneTimer() {
    setInterval(cloneConsole, 100);
}

// Make a variable called scroll 
// Use scroll to auto scroll
var scroll = setInterval(function () { window.scrollBy(0, 3000); }, 0);



// Call the functions
senal();
clone();
space();
cloneTimer();