function deleteCourse(id){
	const swalWithBootstrapButtons = Swal.mixin({
  customClass: {
    confirmButton: 'btn ml-3 btn-success',
    cancelButton: 'btn btn-danger'
  },
  buttonsStyling: false
})

swalWithBootstrapButtons.fire({
  title: 'Are you sure?',
  text: "You won't be able to revert this!",
  icon: 'warning',
  showCancelButton: true,
  confirmButtonText: 'Yes, delete it!',
  cancelButtonText: 'No, cancel!',
  reverseButtons: true
}).then((result) => {
  if (result.isConfirmed) {
	$.ajax({
		url:"/delete-course/"+id,
		success: function(res){
			console.log(res);
		},
	});
    swalWithBootstrapButtons.fire(
      'Deleted!',
      'The course has been deleted.',
      'success'
    ).then((ok) => {
	if(ok){
	location.href="/all-courses";
	}
});
  } else if (
    /* Read more about handling dismissals below */
    result.dismiss === Swal.DismissReason.cancel
  ) {
    swalWithBootstrapButtons.fire(
      'Cancelled',
      'The course is safe :)',
      'error'
    )
  }
})
	
	
}