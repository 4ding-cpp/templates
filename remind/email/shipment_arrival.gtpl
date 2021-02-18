<p>
  <span style="background-color: transparent">
    您在 {{ .StoreName }} 的訂單（編號：{{ .Order.OrderID }}）
  </span>
</p>
<p>
  <span style="background-color: transparent">
    已於 {{ .UpdateAt }} 完成出貨，
  </span>
</p>
<p>
  <span style="background-color: transparent">
    本次出貨資訊如下，如有任何疑問請與我們聯繫。
  </span>
</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>
  <span style="background-color: rgb(250, 250, 248)">【收件資訊】</span>
</p>
<p>
  <span style="background-color: transparent">
    收件人： {{ mask .Order.Other.Receiver.Name }}&nbsp;&nbsp;
  </span>
</p>
<p>
  <span style="background-color: transparent">
    聯絡電話： {{ mask .Order.Other.Receiver.Phone }}&nbsp;&nbsp;
  </span>
</p>
<p>
  <span style="background-color: transparent">
    收件地址： {{ .Order.Destination }}&nbsp; &nbsp;
  </span>
</p>