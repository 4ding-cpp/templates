<p>
  您在 {{ .StoreName }} 的訂單已完成訂購，以下是您的訂單明細：
</p>
<p>
  ※ 請注意! {{ .StoreName }} 保留接受訂單與否的權利
</p>
<p>
  ----------------------------------------------------------------------------------------------------------------
</p>
<p>
  訂單編號：{{ .Order.OrderID }}
</p>
<p>
  付款方式： {{ .Order.PaymentTypeString }}
</p>
<p>
  訂單狀態： {{ .Order.StateString }}
</p>
<p>
  訂購日期： {{ .Order.CreateAt }}
</p>
<p></p>
<p>
  <span style="background-color: rgb(250, 250, 248)">【訂購明細】</span>
</p>
{{- range.Order.Goods }}
<p>
  {{ .Name }} ${{ .Price }} X{{ .Amount }}
</p>
{{- end }}
<p></p>
<p>
  商品小計 $ {{ .Order.Price }}
</p>
<p>
  折價券 $ 0
</p>
<p>
  活動折扣 $ -{{ .Order.ActivityDiscount }}
</p>
<p>
  運費 $ {{ .Order.Freight }}
</p>
<p></p>
<p>
  <span style="background-color: transparent">總計 </span>
  <span style="background-color: transparent; color: rgb(255, 0, 0)">
    $ {{ .Order.Total }}
  </span>
</p>
<p></p>
<p>
  ----------------------------------------------------------------------------------------------------------------
</p>
<p>
  <span style="color: rgb(255, 83, 83); background-color: transparent">
    提醒您：
  </span>
  <span style="color: rgb(136, 136, 136); background-color: transparent">
    我們不會以電話或簡訊通知變更付款方式，也不會要您前往ATM進行任何操作。
  </span>
</p>
<p>
  <span style="color: rgb(136, 136, 136); background-color: transparent">
    若有任何疑慮，請洽詢165反詐騙專線。
  </span>
</p>
<p></p>
<p></p>
<p>
  <span style="background-color: rgb(250, 250, 248)">【收件資訊】</span>
</p>
<p>
  收件人： {{ mask .Order.Other.Receiver.Name }}
</p>
<p>
  聯絡電話： {{ mask .Order.Other.Receiver.Phone }}
</p>
<p>
  收件地址： {{ .Order.Destination }}
</p>