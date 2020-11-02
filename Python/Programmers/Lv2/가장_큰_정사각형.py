def solution(board):
    answer = 0
    x = len(board)
    y = len(board[0])
    max_val = 0
    if x <= 1 or y <= 1: return 1
    print(y)
    for i in range(1,x):
        for j in range(1,y):
            if board[i][j] >= 1:
                up = board[i-1][j]
                left = board[i][j-1]
                up_left = board[i-1][j-1]
                min_val = min(up,left,up_left)
                board[i][j] = min_val + 1
                max_val = max(max_val,min_val+1)

    answer = pow(max_val,2)

    return answer

b = [[0,0,0,0],[0,1,0,0]]
print(solution(b))