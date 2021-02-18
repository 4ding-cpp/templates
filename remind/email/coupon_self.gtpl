<p>恭喜您已經獲得會員優惠券！</p>
<p>
  <span style="background-color: transparent">
    {{- if .Coupon.IsAuto }}
    只要前往購物時選取優惠券，即可立即享有優惠！
    {{- else }}
    只要在購物時輸入「{{ .Coupon.Code }}」，即可立即享有優惠！
    {{ -end }}
  </span>
</p>
<p>
  <span style="background-color: transparent">優惠券說明：</span>
</p>
<p>
  <span style="background-color: transparent">
    優惠內容：
    {{- if gt .Coupon.Active.Discount 0 }}
    總價折扣 打 {{ .Coupon.Active.Discount }} 折
    {{ -end }}
    {{- if gt .Coupon.Active.Reduce 0 }}
    訂單金額現折 NT${{ .Coupon.Active.Reduce }}
    {{ -end }}
  </span>
</p>
<p>
  <span style="background-color: transparent">
    有效期間：{{ .Coupon.BeginAt }} ～ {{ .Coupon.EndAt }}
  </span>
</p>