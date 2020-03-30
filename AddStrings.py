    def addStrings(self, num1: str, num2: str) -> str:
        if not num1 or not num2:
            return num2 or num1
        res=""
        #len1 is last index in num1 array
        len1 = len(num1) - 1
        len2 = len(num2) - 1
        carry = 0
        while (len1 >= 0 or len2 >= 0):
            n1 = int(num1[len1]) if len1 >= 0 else 0
            n2 = int(num2[len2]) if len2 >= 0 else 0
            sum = n1 + n2 + carry
            res += str(sum % 10)
            carry = sum // 10
            len1 -= 1
            len2 -= 1
        if carry:
            return str(carry) + res[::-1]
        else :
            return res[::-1]
