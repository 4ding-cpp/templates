親愛的{{ mask .User.Name }}，
您購買的商品已於{{ .Order.Arrival }}
到達{{ .Order.Other.Receiver.CVS.Name }}，
{{- if .Order.IsLogisticsPay }}
<!--取貨付款-->
請於一週內攜帶＄{{ add .Order.Price .Order.Freight }}
{{- else }}
<!--純取貨-->
請於一週內攜帶身分證件
{{- end }}
前往領取。
