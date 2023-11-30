let favouriteProgrammingLanguage1 = "Java";
let favouriteProgrammingLanguage2 = "JavaScript";
let favouriteProgrammingLanguageTemp = "";

let a = 20;
let b = 57;

function variableExchange1() {
  console.log(
    "Favourite Programming Language 1 Before : " + favouriteProgrammingLanguage1
  );
  console.log(
    "Favourite Programming Language 2 Before : " + favouriteProgrammingLanguage2
  );

  favouriteProgrammingLanguageTemp = favouriteProgrammingLanguage1;
  favouriteProgrammingLanguage1 = favouriteProgrammingLanguage2;
  favouriteProgrammingLanguage2 = favouriteProgrammingLanguageTemp;

  console.log(
    "Favourite Programming Language 1 After : " + favouriteProgrammingLanguage1
  );
  console.log(
    "Favourite Programming Language 2 After : " + favouriteProgrammingLanguage2
  );
}

function variableExchange2() {
  console.log("Value of a before : " + a);
  console.log("Value of b before : " + b);

  a = a + b;
  b = a - b;
  a = a - b;

  console.log("Value of a after : " + a);
  console.log("Value of b after  : " + b);
}

variableExchange1();
variableExchange2();
