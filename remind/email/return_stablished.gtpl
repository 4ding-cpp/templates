<p>
    您在 {{ .StoreName }} 的訂單（編號：{{ .Order.OrderID }}）
    申請之退換貨已審核過，
</p>

<!-- 超商退貨碼 -->
{{- if eq .Order.ReturnType 1 }}
<p>請憑退貨代碼『{{ .Order.Other.ReturnCode }}』在48小時內，</p>
<p>至列『{{ .Order.ReturnStore }}』超商印單據後，於櫃檯完成寄件。</p>
{{- end }}

<!-- 宅配取件通知 -->
{{- if eq .Order.ReturnType 3 }}
<p>兩日內物流車會來接收。</p>
{{- end }}

<!-- 自訂退貨 -->
{{- if eq .Order.ReturnType 9 }}
<p>{{ .Order.Other.ReturnRemark }}</p>
{{- end }}

<p>並請將完整商品、贈品、附件連同勾選完成的出貨明細表</p>
<p>一併包裝妥善，謝謝。</p>