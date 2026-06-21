let pw = "sameer123"
let count = 0
let hascapital = false;
let haslower = false;
let hasnumber = false
let hasspecial = false;
if(pw.length >= 8)
{
    count++;
}
for(let i = 0; i < pw.length; i++)
{
    let ch = pw[i];
    if(ch >= "A" && ch <= "Z")
    {
        hascapital = true;
    }
    else if(ch >= "a" && ch <= "z")
    {
        haslower = true;
    }
    else if(ch >= "0" && ch <= "9")
    {
        hasnumber = true;
    }
    else
    {
        hasspecial = true;
    }
}
if(hascapital) count++;
if(haslower) count++;
if(hasnumber) count++;
if(hasspecial) count++;

console.log(`Password score: ${count} / 5`);