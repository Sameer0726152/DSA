//Method 1
let name = "Alice";
let reversed = name.split("").reverse().join("");
console.log(reversed);

//Method 2
let name2 = "sameer";
let reverse = "";
for(let i = name2.length - 1; i >= 0; i--)
{
    reverse += name2[i];
}
console.log(reverse);
