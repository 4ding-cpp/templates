親愛的{{ mask .User.Name }}，
您在{{ .StoreName }}的訂單（{{ .Order.OrderID }}）退換貨申請結果，
{{- if eq .Order.State 2 }}
申請原因不完善故審核未通過，若有問題請詢問店家，謝謝。
{{- else }}
審核已通過請前往購物站選取退貨方式，謝謝。
{{- end}}