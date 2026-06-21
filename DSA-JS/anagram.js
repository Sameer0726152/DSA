let word1 = "idk";
let word2 = "silent";
let sorted1 = word1.split("").sort().join("");
let sorted2 = word2.split("").sort().join("");
if(sorted1 === sorted2)
{
    console.log("Is an anagram");
}
else
{
    console.log("Is not an anagram");
}