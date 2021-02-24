<p>
  您在 {{ .StoreName }} 的訂單（編號：{{ .Order.OrderID }}）
</p>
<p>
  已於 {{ .UpdateAt }} 完成出貨，
</p>
<p>
  本次出貨資訊如下，如有任何疑問請與我們聯繫。
</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>
  <span style="background-color: rgb(250, 250, 248)">【收件資訊】</span>
</p>
<p>
  收件人： {{ mask .Order.Other.Receiver.Name }}&nbsp;&nbsp;
</p>
<p>
  聯絡電話： {{ mask .Order.Other.Receiver.Phone }}&nbsp;&nbsp;
</p>
<p>
  收件地址： {{ .Order.Destination }}&nbsp; &nbsp;
</p>