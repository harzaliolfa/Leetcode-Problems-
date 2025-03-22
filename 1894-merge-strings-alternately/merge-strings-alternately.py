class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        merged_string = ""
        additional_letters=""
        min_length = min(len(word1) , len(word2))
        if (len(word1) > len(word2)):
            additional_letters = word1[len(word2) : ]
        elif (len(word1) < len(word2)):
            additional_letters = word2[len(word1): ]

        for i, j in zip(word1[:min_length], word2[:min_length]):
            merged_string += i + j
        merged_string += additional_letters
        return merged_string