class Solution
{
public:
  struct TrieNode
  {
    bool isEndOfWord;
    TrieNode *children[26];
    TrieNode()
    {
      isEndOfWord = false;
      for (int i = 0; i < 26; i++)
      {
        children[i] = nullptr;
      }
    }
  };
  TrieNode *root = new TrieNode();
  void insert(string &word)
  {
    TrieNode *ptr = root;
    for (int i = 0; i < word.length(); i++)
    {
      int index = word[i] - 'a';
      if (ptr->children[index] == nullptr)
      {
        ptr->children[index] = new TrieNode();
      }

      ptr = ptr->children[index];
    }
    ptr->isEndOfWord = true;
  }
  bool search(string &word)
  {
    TrieNode *ptr = root;
    for (int i = 0; i < word.length(); i++)
    {
      int index = word[i] - 'a';
      ptr = ptr->children[index];
      if (ptr == nullptr || ptr->isEndOfWord == false)
        return false;
    }
    return true;
  }
  string longestString(vector<string> &arr)
  {
    for (string word : arr)
    {
      insert(word);
    }
    string result = "";
    for (string &word : arr)
    {
      if (search(word))
      {
        if (word.length() > result.length() || (word.length() == result.length() && word < result))
          result = word;
      }
    }
    return result;
  }
};