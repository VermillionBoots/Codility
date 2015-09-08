T = int(input())

for i in range(0,T):
    cubes = int(input())
    cubeList = (input()).split()
    left = 0
    right = cubes-1
    lastCube = pow(2,31)
    fail = False
    while right-left>0:
        if cubeList[left] == cubeList[right]:
            lastCube = int(cubeList[left])
            left += 1
            right -= 1   
        elif int(cubeList[left])>int(cubeList[right]) and int(cubeList[left])<=lastCube:
            lastCube = int(cubeList[left])
            left += 1
        elif int(cubeList[right])>int(cubeList[left]) and int(cubeList[right])<=lastCube:
            lastCube = int(cubeList[right])
            right -= 1
        else:
            fail = True
            break
                
    if fail == False: 
        print('Yes')
    else:
        print('No')
