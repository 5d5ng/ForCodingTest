def solution(s):
    answer =''
    s = s.strip()
    s = s.lower()
    lst = s.split(" ")
    for st in lst:
        st = st.capitalize()
        answer+=st+" "

    return answer[:-1]



