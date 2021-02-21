import math
import random
import re
import os
import system

def hgalss(arr):
    maxs=-99

    for i in range(4):
        for j in range(4):
            row1=sum(arr[i][j:j+3])
            row2=sum(arr[i+1][j+1])
            row3=sum(arr[i+2][j:j+3])
            hglass=row1+row2+row3

            maxs=max(hglass,maxs)

        return maxs
