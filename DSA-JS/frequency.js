let word = "mississippi";
let freq = {};
for(let i = 0; i < word.length; i++)
{
    let ch = word[i];
    if(freq[ch])
    {
        freq[ch]++;
    }
    else
    {
        freq[ch] = 1;
    }
}
console.log(freq);