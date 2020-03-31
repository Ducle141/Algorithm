n1 = n = ListNode(0)
n.next = head
while n.next and n.next.next:
    p = n.next
    q = n.next.next
    #swap
    n.next, p.next, q.next = q, q.next, p
    n = p
return n1.next
