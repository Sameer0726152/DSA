//Method 1
let name = "idkman";
let palindrome = "";
for(let i = name.length - 1; i >= 0; i--)
{
    palindrome += name[i];
}
if(name === palindrome)
{
    console.log("Is a palindrome");
}
else
{
    console.log("Is not a palindrome");
}

//Method 2
let name2 = "racecar";
isPalindrome = false
let left = 0;
let right = name2.length - 1;
while(left < right)
{
    if(name2[left] !== name2[right])
    {
        return console.log(isPalindrome);
    }
    left++;
    right--;
}
isPalindrome = true;
console.log(isPalindrome);

//Method 3
let name3 = "lorem"
let reversed = name.split("").reverse().join("");
if(name3 === reversed)
{
    console.log("Is a palindrome")
}
else
{
    console.log("Is not a palindrome");
}