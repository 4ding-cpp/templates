<p>
  <span style="background-color: transparent">
    您在 {{ .StoreName }} 的訂單已完成訂購，以下是您的訂單明細：
  </span>
</p>
<p>
  <span style="background-color: transparent">
    ※ 請注意! {{ .StoreName }} 保留接受訂單與否的權利
  </span>
</p>
<p></p>
<p>
  <span style="background-color: transparent">
    訂單編號：{{ .Order.OrderID }}
  </span>
</p>
<p>
  <span style="background-color: transparent">
    付款方式： {{ .Order.PaymentTypeString }}
  </span>
</p>
<p>
  <span style="background-color: transparent">
    訂單狀態： {{ .Order.StateString }}
  </span>
</p>
<p>
  <span style="background-color: transparent">
    訂購日期： {{ .Order.CreateAt }}
  </span>
</p>
<p></p>
<p>
  <span style="background-color: rgb(250, 250, 248)">【訂購明細】</span>
</p>
{{ -range.Order.Goods }}
<p>
  <span style="background-color: transparent">
    {{ .Name }} ${{ .Price }} X{{ .Amount }}
  </span>
</p>
{{ -end }}
<p></p>
<p>
  <span style="background-color: transparent">
    商品小計 $ {{ .Order.Price }}
  </span>
</p>
<p>
  <span style="background-color: transparent">折價券 $ 0 </span>
</p>
<p>
  <span style="background-color: transparent">
    活動折扣 $ -{{ .Order.ActivityDiscount }}
  </span>
</p>
<p>
  <span style="background-color: transparent">
    運費 $ {{ .Order.Freight }}
  </span>
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
  <span style="background-color: transparent">
    ----------------------------------------------------------------------------------------------------------------
  </span>
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
  <span style="background-color: transparent">
    收件人： {{ mask .Order.Other.Receiver.Name }}
  </span>
</p>
<p>
  <span style="background-color: transparent">
    聯絡電話： {{ mask .Order.Other.Receiver.Phone }}
  </span>
</p>
<p>
  <span style="background-color: transparent">
    收件地址： {{ .Order.Destination }}
  </span>
</p>