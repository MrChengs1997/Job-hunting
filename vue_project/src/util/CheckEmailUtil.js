//邮箱格式校验方法
export default {
  checkEmail (email){
    if (email === ''){
      this.beErrorMsg="请正确填写邮箱"
      this.beError='block'
      return;
    }
    if (email !== ''){
      var reg = /^[A-Za-z0-9\u4e00-\u9fa5]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/;
      if(!reg.test(email)){
        this.beErrorMsg="请输入有效的邮箱"
        this.beError='block'
        return
      }
    }
  },

}
// if (email === ''){
//   this.beErrorMsg="请正确填写邮箱"
//   this.beError='block'
//   return;
// }
// if (email !== ''){
//   var reg = /^[A-Za-z0-9\u4e00-\u9fa5]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/;
//   if(!reg.test(email)){
//     this.beErrorMsg="请输入有效的邮箱"
//     this.beError='block'
//     return
//   }
// }
