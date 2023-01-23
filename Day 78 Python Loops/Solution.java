if __name__ == '__main__':
    n = int(input())
    if n >= 1 and n <= 20:
        for n in range(0, n):
            print(pow(n, 2))
    else: print("input number between 1 to 20")
