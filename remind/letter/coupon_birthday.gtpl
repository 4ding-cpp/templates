親愛的{{ mask .User.Name }}， 恭喜您獲得生日優惠券！
{{- if .Coupon.IsAuto }}
購物時選取優惠券，即可立即享有優惠！
{{- else }}
優惠券兌換碼為「{{ .Coupon.Code }}」，
{{- end }}
活動至{{ datetime .Coupon.EndAt }}止。