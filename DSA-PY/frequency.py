word = "Mississippi"
freq = {}
for i in range(len(word)):
    ch = word[i]
    if ch in freq:
        freq[ch] += 1
    else:
        freq[ch] = 1
print(freq)