您在{{ .StoreName }}的訂單（編號：{{ .Order.OrderID}}）退換貨已審核過，
{{- if eq .Order.ReturnType 3 }}
兩日內物流車會來接收，請將完整商品包裝妥善，謝謝。
{{- else }}
請憑退貨代碼『{{ .Order.Other.ReturnCode }}』在48小時內，
至『{{ .Order.ReturnStore }}』超商列印單據後，於櫃檯完成寄件。
{{- end }}