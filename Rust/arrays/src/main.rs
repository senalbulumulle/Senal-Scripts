fn main() {
 	// Here, this is where we are able to create an variable
	// which stores that array of numbers 

	let numberarray = [10, 20, 30, 40, 50, 60]; 


	// Here, this is where we are able to pick the array
	// using the picknumberarray variable, which is also 
	// used to initialize .len() feature, also with other
	// numberarray.<> features.
	
	let picknumberarray = numberarray.len();


	// This is where we are able to print out the picknumberarray
	// to test out if it is working or not. 
	println!("{}", picknumberarray);


	// Use the four loop to create a number array

	for number in numberarray {
		println!("The number is: {}", number);
	}


    let particular_number = numberarray[2];
    println!("{}", particular_number);
}
