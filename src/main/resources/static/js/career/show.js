'use strict';

{
	const deleteButton = document.getElementById("delete-button-alert");
	deleteButton.addEventListener('click', () => {
		confirm("本当に削除しますか？");
	});
}
