https://leetcode.com/problems/expression-add-operators/description/?envType=problem-list-v2&envId=m3r184od

public List<String> addOperators(String num, int target) {
    List<String> res = new ArrayList<>();
    dfs(res, "", num, target, 0, 0, 0);
    return res;
}

private void dfs(List<String> res, String path, String num, int target, int pos, long eval, long multed) {
    if (pos == num.length()) {
        if (eval == target) res.add(path);
        return;
    }
    for (int i = pos; i < num.length(); i++) {
        if (i != pos && num.charAt(pos) == '0') break;
        String curStr = num.substring(pos, i + 1);
        long cur = Long.parseLong(curStr);
        if (pos == 0) {
            dfs(res, curStr, num, target, i + 1, cur, cur);
        } else {
            dfs(res, path + "+" + curStr, num, target, i + 1, eval + cur, cur);
            dfs(res, path + "-" + curStr, num, target, i + 1, eval - cur, -cur);
            dfs(res, path + "*" + curStr, num, target, i + 1, eval - multed + multed * cur, multed * cur);
        }
    }
}
