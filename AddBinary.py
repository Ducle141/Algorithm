def addBinary(self, a: str, b: str) -> str:
    carry = 0
    res = []
    len_a = len(a) -1
    len_b = len(b) -1 
    while len_a >= 0 or len_b >= 0:
        num_a = (int)(a[len_a]) if len_a >= 0 else 0
        num_b = (int)(b[len_b]) if len_b >= 0 else 0
        num_sum = (num_a + num_b + carry) % 2
        carry = (num_a + num_b + carry) // 2            
        res.append(num_sum)
        len_a -= 1
        len_b -= 1
    if carry:
        res.append(carry)
    res = res[::-1]
    return "".join(str(x) for x in res)
