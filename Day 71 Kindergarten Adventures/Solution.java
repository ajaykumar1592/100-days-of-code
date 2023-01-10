#include <bits/stdc++.h>

using namespace std;

string ltrim(const string &);
string rtrim(const string &);
vector<string> split(const string &);

/*
 * Complete the 'solve' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY t as parameter.
 */


    int solve(vector<int> t) {
    int n = t.size();
    /* n < 10^5
    Must move to heap memory
    */
    int arr[n+1] = {0}; 
    
    for (int i = 0; i < n; ++i) {
        if (t[i] - i > 0) {
            /* t[i] > i
            The start point is included in (i+1,n - (t[i]-i))
            Add 1 in the count array when go into the interval
            Remove 1 when go out the interval
            */
            arr[i+1] += 1;
            arr[n - (t[i]-i) + 1] -= 1;
        }
        else {
            /* t[i] <= i
            The start point is included in (0,i - t[i]) and (i+1,n-1)
            Add 1 in the count array when go into the interval
            Remove 1 when go out the interval
            */
            arr[0] += 1;
            arr[i - t[i] + 1] -= 1;
            arr[i+1] += 1;
            arr[n] -= 1;
        } 
    }
    
    int index = 0;
    int count = 0;
    int max = 0;
    
    for (int i = 0; i < n; ++i) {
        count += arr[i];
        if (count > max) {
            max = count;
            index = i + 1;
        } 
    }
    
    return index;
}



int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string t_count_temp;
    getline(cin, t_count_temp);

    int t_count = stoi(ltrim(rtrim(t_count_temp)));

    string t_temp_temp;
    getline(cin, t_temp_temp);

    vector<string> t_temp = split(rtrim(t_temp_temp));

    vector<int> t(t_count);

    for (int i = 0; i < t_count; i++) {
        int t_item = stoi(t_temp[i]);

        t[i] = t_item;
    }

    int id = solve(t);

    fout << id << "\n";

    fout.close();

    return 0;
}

string ltrim(const string &str) {
    string s(str);

    s.erase(
        s.begin(),
        find_if(s.begin(), s.end(), not1(ptr_fun<int, int>(isspace)))
    );

    return s;
}

string rtrim(const string &str) {
    string s(str);

    s.erase(
        find_if(s.rbegin(), s.rend(), not1(ptr_fun<int, int>(isspace))).base(),
        s.end()
    );

    return s;
}

vector<string> split(const string &str) {
    vector<string> tokens;

    string::size_type start = 0;
    string::size_type end = 0;

    while ((end = str.find(" ", start)) != string::npos) {
        tokens.push_back(str.substr(start, end - start));

        start = end + 1;
    }

    tokens.push_back(str.substr(start));

    return tokens;
}
