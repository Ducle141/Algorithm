        #1. replace special punctual. 2. split paragraph as an array of word
        #3. make a dictionary of word (word : frequency). 4. check in dict.items()
        #to get the word appeared the most        
        for punc in "!?',;.":
            paragraph = paragraph.replace(punc," ")
        
        # count and return 
        words = [word.lower() for word in paragraph.split()]
        dictWordCount = collections.Counter(words)
        largest,ans = -1,""
        for word,count in dictWordCount.items():
            if word not in banned and count>largest:
                largest,ans = count,word
        return ans
