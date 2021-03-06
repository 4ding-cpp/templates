<p>帳號已經開通，請於<a href="https://business.4ding.tw/login">入口網站</a>登入</p>
<p>預設密碼為『{{ .Password }}』，登入後請優先重設密碼。</p>
<p>帳號開通後系為您準備獨立資料庫，需等待５分鐘左右</p>

{{- if ne .Point 0}}
<p>系統活動開通即贈點數{{ .Point }}點</p>
{{- end }}