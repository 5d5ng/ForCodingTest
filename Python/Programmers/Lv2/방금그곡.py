def solution(m,musicinfos):
    playList = []
    target = ["C#","D#","F#","G#","A#"]
    replace = ["Z","Y","X","V","N"]
    for i in range(len(target)):
        m = m.replace(target[i],replace[i])
    def getPlayTime(start,end):
        starthour = int(start[:start.index(":")])
        startmin = int(start[start.index(":")+1:])
        endhour = int(end[:end.index(":")])
        endmin = int(end[end.index(":")+1:])
        starthour*=60
        endhour*=60
        start = starthour+startmin
        end = endhour+endmin
        return end - start
    for s in musicinfos:
        data = s.split(",")
        for i in range(len(target)):
            data[3] = data[3].replace(target[i],replace[i])
        temp = ""
        playtime = getPlayTime(data[0],data[1])
        print(playtime)
        if(len(m)<= playtime):
            for i in range(playtime):
                temp+=data[3][i%len(data[3])]
            tempLst = []
            if m in temp:
                tempLst.append(len(temp))
                tempLst.append(int(data[0][:2]+data[0][3:]))
                tempLst.append(data[2])
            if tempLst:
                playList.append(tempLst)
    
    if len(playList) == 0:
        return "'(None)'"
    playList = sorted(playList,key=lambda x: (-x[0]))
    return playList[0][2]

m = "C"
ar = ["12:00,12:00,HELLO,CDEFGAB", "11:00,11:01,WORLD,ABCDEF"]
s ="ABCDEFABCDEFABCDEFABCDEFABCDEFABCDEFABCDEFABCDEFABCDEFABCDEFABCDEFABCDEFABC"
print( m in s)
print(solution(m,ar))
