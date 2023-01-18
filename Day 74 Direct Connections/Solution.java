package main

import (
    "fmt"
    "io/ioutil"
    "os"
    "sort"
)

func main() {
    sb, err := ioutil.ReadAll(os.Stdin)
    if err != nil {
        panic(err)
    }
    accu := 0
    indigit := false
    for _, b := range sb {
        if b < byte('0') {
            if indigit {
                use(accu)
                accu = 0
                indigit = false
            }
        } else {
            indigit = true
            accu = accu*10 + int(b-byte('0'))
        }
    }
    if indigit {
        use(accu)
    }
}

var state = 0
var t = 0
var ti = 0
var n = 0
var ni = 0

var xp [][]int

func use(val int) {
    switch state {
    case 0:
        t = val
        ti = t
        state++
    case 1:
        n = val
        ni = n
        xp = make([][]int, 0, n)
        state++
    case 2:
        xp = append(xp, []int{val, 0})
        ni--
        if ni == 0 {
            state++
        }
    case 3:
        xp[ni][1] = val
        ni++
        if ni == n {
            solve()
            state++
            ti--
            if ti > 0 {
                state = 1
            }
        }
    default:
        panic("state")
    }
}

func solve() {
    sort.Slice(xp,
        func(i, j int) bool {
            return xp[i][1] > xp[j][1]
        })
    km := int64(0)
    for i := 0; i < len(xp); i++ {
        for j := i + 1; j < len(xp); j++ {
            distance := xp[i][0] - xp[j][0]
            if distance < 0 {
                distance = -distance
            }
            largestP := xp[i][1]
            km += int64(largestP) * int64(distance)
        }
        // periodically knock it down, not at end.
        km = km % 1000000007
    }
    fmt.Println(km)
}
