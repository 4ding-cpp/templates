<p>
  您購買的商品已於{{ .Order.Arrival }}
  到達{{ .Order.Other.Receiver.CVS.Name }}
</p>
<p>
  {{- if .Order.IsLogisticsPay }}
  <!--取貨付款-->
  請於一週內攜帶＄{{ add .Order.Price .Order.Freight }}
  {{- else }}
  <!--純取貨-->
  請於一週內攜帶身分證件
  {{- end }}
  至{{ .Order.Other.Receiver.CVS.Address }}
  領取編號為{{ .Order.OrderID }}。
</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>
  請您於貨物送達後盡快前往取貨。
</p>
<p>
  提醒您務必於 {{ .Order.Deadline }} 日前領取，
</p>
<p>
  若逾期未領取，商品將自便利商店門市退回而無法領取。
</p>