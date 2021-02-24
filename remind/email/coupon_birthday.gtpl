<p>恭喜您已經獲得會員生日優惠券！</p>
<p>
  {{- if .Coupon.IsAuto }}
  只要前往購物時選取優惠券，即可立即享有優惠！
  {{- else }}
  只要在購物時輸入「{{ .Coupon.Code }}」，即可立即享有優惠！
  {{- end }}
</p>
<p>
  優惠券說明：
</p>
<p>
  優惠內容：
  {{- if gt .Coupon.Active.Discount 0.0 }}
  總價折扣 打 {{ .Coupon.Active.Discount }} 折
  {{- end }}
  {{- if gt .Coupon.Active.Reduce 0.0 }}
  訂單金額現折 NT${{ .Coupon.Active.Reduce }}
  {{- end }}
</p>
<p>
  有效期間：{{ .Coupon.BeginAt }} ～ {{ .Coupon.EndAt }}
</p>