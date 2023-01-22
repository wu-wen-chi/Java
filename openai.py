import openai
openai.api_key = "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"
response = openai.Completion.create(
  model="text-davinci-003",
  prompt="\nHuman: 請用Java寫BFS\nAI:", # 請用Java寫DFS
  temperature=0.9,
  max_tokens=500,
  top_p=1,
  frequency_penalty=0.0,
  presence_penalty=0.6,
  stop=[" Human:", " AI:"]
)
print(response["choices"][0]["text"])