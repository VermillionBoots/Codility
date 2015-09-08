nm = input()
nm = nm.split()

array = []
like = []
dislike = []
happiness = 0

array = (input()).split()
like = (input()).split()
dislike = (input()).split()

likeSet = set(like)
dislikeSet = set(dislike)
arraySet = set(array)

likeSetSmall = likeSet-dislikeSet
likeSet = likeSetSmall.intersection(arraySet)

dislikeSetSmall = dislikeSet-likeSet
dislikeSet = dislikeSetSmall.intersection(arraySet)

for i in range(0,len(array)):
    if array[i] in likeSet:
        happiness += 1
    elif array[i] in dislikeSet:
        happiness -= 1

print(happiness)
