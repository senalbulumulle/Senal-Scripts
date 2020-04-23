/* OY Mates, this is Senal and we are going to clone various different Senal's. */
/* 2020 Senal Bulumulle */
/* Javascript Version */ 

// We are going to make a function called senal. This function contains the image of Senal
function senal(){
    // We use document.write to make a img syntax just like in HTML format 
    document.write("<img src='./Image/senal.png' width='36'></img>"); // This is the image file of Senal 
}



// Then we replicate the image for 5 milliseconds on the clone () function
function clone(){
    setInterval(senal,2 );
    // Console.logs
    console.log(clone);
    
}



// Call the Functions 
senal();
clone();

// Make a Space for the group of cloned Senals 
function cloneConsole(){
    
    document.write("<img src='./Image/space.png' width='36'></img>");
}
function cloneTimer(){
    setInterval(cloneConsole,100);
}

cloneConsole();
cloneTimer();

var scroll = setInterval(function(){ window.scrollBy(0,3000); }, 0);
