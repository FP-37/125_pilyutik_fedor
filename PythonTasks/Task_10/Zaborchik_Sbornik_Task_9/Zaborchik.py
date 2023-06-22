zaborchik = list(str(input()))

def _2007_(zabor):

    x = 0
    y = 0
    zabor_mod = []
    symbol = (',','.','!','?','1','2','3','4','5','6','7','8','9','0','@')

    while y < len(zabor):

        if zabor[y] not in symbol:
            if x%2 == 0:
                a = str(zabor[y]).upper()
                zabor_mod.append(a)
            else:
                a = str(zabor[y]).lower()
                zabor_mod.append(a)
            x += 1

        else:
            a = str(zabor[y])
            zabor_mod.append(a)
            x += 2
        y += 1

    haha = "".join(zabor_mod)
    return haha

print(_2007_(zaborchik))