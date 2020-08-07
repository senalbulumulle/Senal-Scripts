var run = document.getElementById("run");

run.addEventListener("click", function (e) {
  
  e.preventDefault();
  
  var stdin = document.getElementById("stdin");
  var form = document.getElementById("form");
  var credits = document.getElementById("credits");
  var output = document.getElementById("output");
  
  output.innerHTML = "Loading...";
  
  console.log(stdin.value);
  
  var obj = {};

  // This is where you put the clientID for the JDoodle API Provider.
  obj["clientId"] = "509399a4aba3530c12d5147e7fd67e86";

  // This is where you put the SecretID for the JDoodle API Provider.
  obj["clientSecret"] = "a01a1840a5841982d6feca7333c47936b9474a67e0c0d452be8bbf9c719c8059";

  // This is where you put the minified code into strings. 
  obj["script"] = "import java.util.HashMap;\r\nimport java.util.Scanner;\r\n\r\npublic class UserNameGenerator {\r\n\r\n\tpublic static void main(String[] args) {\r\n\t\t\r\n\t\t// Prompt the user to enter the first letter of your first name and the day you were born \r\n\t\tSystem.out.println(\"Enter the first letter of your name and \\n\" + \"the day of the month you were born: \");\r\n\t\t\r\n\t\t// Make a Scanner Object\r\n\t\tScanner scan = new Scanner(System.in);\r\n\t\t\r\n\t\t// Create a Scanner Variable for the first letter of the first name\r\n\t\tString letter = scan.next().toUpperCase();\r\n\t\t\r\n\t\t// Create a integer scanner variable for the day they were born \r\n\t\tint day = scan.nextInt();\r\n\t\t\r\n\t\t// Make a HashMap Variable called letters\r\n\t\tHashMap<String, String> letters = new HashMap<String, String>();\r\n\t\t\r\n\t\t// Make an alphabetical list of letters \r\n\t\tletters.put(\"A\", \"Captain\");\r\n\t\tletters.put(\"B\", \"Lavish\");\r\n\t\tletters.put(\"C\", \"Shiny Bot\");\r\n\t\tletters.put(\"D\", \"High Note\");\r\n\t\tletters.put(\"E\", \"Pretty\");\r\n\t\tletters.put(\"F\", \"Divine\");\r\n\t\tletters.put(\"G\", \"Beautiful\");\r\n\t\tletters.put(\"H\", \"Handy\");\r\n\t\tletters.put(\"I\", \"Intelligent\");\r\n\t\tletters.put(\"J\", \"Smile\");\r\n\t\tletters.put(\"K\", \"Krazy\");\r\n\t\tletters.put(\"L\", \"Loving\");\r\n\t\tletters.put(\"M\", \"Royal\");\r\n\t\tletters.put(\"N\", \"Nice\");\r\n\t\tletters.put(\"O\", \"Optimistic\");\r\n\t\tletters.put(\"P\", \"Proud\");\r\n\t\tletters.put(\"Q\", \"Masterful\");\r\n\t\tletters.put(\"R\", \"Honorable\");\r\n\t\tletters.put(\"S\", \"Justice\");\r\n\t\tletters.put(\"T\", \"Trusting\");\r\n\t\tletters.put(\"U\", \"Fabulous\");\r\n\t\tletters.put(\"V\", \"Kind\");\r\n\t\tletters.put(\"W\", \"Wonderful\");\r\n\t\tletters.put(\"X\", \"Saving\");\r\n\t\tletters.put(\"Y\", \"Thoughtful\");\r\n\t\tletters.put(\"Z\", \"Brilliant\");\r\n\t\t\r\n\t\t// Make a HashMap Variable called days\r\n\t\tHashMap<Integer, String> days = new HashMap<Integer, String>();\r\n\t\t\r\n\t\t// List the days of the month\r\n\t\tdays.put(1, \"Sour\");\r\n\t\tdays.put(2, \"Great\");\r\n\t\tdays.put(3, \"Old\");\r\n\t\tdays.put(4, \"Loud\");\r\n\t\tdays.put(5, \"Little\");\r\n\t\tdays.put(6, \"Epic\");\r\n\t\tdays.put(7, \"Wet\");\r\n\t\tdays.put(8, \"Dank\");\r\n\t\tdays.put(9, \"Fake\");\r\n\t\tdays.put(10, \"Sentle\");\r\n\t\tdays.put(11, \"Musty\");\r\n\t\tdays.put(12, \"Sharp\");\r\n\t\tdays.put(13, \"Dangerous\");\r\n\t\tdays.put(14, \"Monotone\");\r\n\t\tdays.put(15, \"Squeaky\");\r\n\t\tdays.put(16, \"Noiseless\");\r\n\t\tdays.put(17, \"Rotten\");\r\n\t\tdays.put(18, \"Fat\");\r\n\t\tdays.put(19, \"Soft\");\r\n\t\tdays.put(20, \"Potent\");\r\n\t\tdays.put(21, \"Sudden\");\r\n\t\tdays.put(22, \"Powerful\");\r\n\t\tdays.put(23, \"Strange\");\r\n\t\tdays.put(24, \"Sturdy\");\r\n\t\tdays.put(25, \"Flat\");\r\n\t\tdays.put(26, \"Full\");\r\n\t\tdays.put(27, \"Windy\");\r\n\t\tdays.put(28, \"Horrid\");\r\n\t\tdays.put(29, \"Beautiful\");\r\n\t\tdays.put(30, \"Hot\");\r\n\t\tdays.put(31, \"Slient\");\r\n\t\t\r\n\t\t// Print out the generated user name.\r\n\t\tSystem.out.println(\"Your User Name is \" + letters.get(letter) + \" \" + days.get(day));\r\n\r\n\t}\r\n\r\n}\r\n"; 

  // This is where you specifiy the programming language for the JDoodle API Provider.
  obj["language"] = "java";




  obj["versionIndex"] = "0";
  obj["stdin"] = stdin.value;
  var jsonStr = JSON.stringify(obj);
  
  console.log(jsonStr);
  
  const proxyurl = "https://cors-anywhere.herokuapp.com/";
  const url = "https://api.jdoodle.com/v1/execute";
  fetch(proxyurl + url, {
    method: 'post',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    body: jsonStr
  })
  .then(response => {
    return response.json()
  })
  .then(data => {
    console.log(data);
    var outputStr = data.output;
    console.log(outputStr);
    var formattedOutput = outputStr.replace(/(?:\r\n|\r|\n)/g, '<br>');
    output.innerHTML = formattedOutput;
  })
  .catch(() => console.log("Can’t access " + url + " response. Blocked by browser?"))
  
  const creditsUrl = "https://api.jdoodle.com/v1/credit-spent";
  fetch(proxyurl + creditsUrl, {
    method: 'post',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    body: jsonStr
  })
  .then(response => {
    return response.json()
  })
  .then(data => {
    console.log(data);
    var creditsLeft = 200 - data.used;
    console.log(credits);
    credits.innerHTML = "Runs left: " + creditsLeft;
  })
  .catch(() => console.log("Can’t access " + url + " response. Blocked by browser?"))
  
  
  
  
});