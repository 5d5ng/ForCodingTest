def solution(s):
    answer =''
    s = s.lower()
    lst = s.split()
    for st in lst:
        st = st.capitalize()
        answer+=st+" "
    answer= answer[:-1]
    return answer


