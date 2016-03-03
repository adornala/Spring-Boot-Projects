/**
 * Dornala
 */

		function search_security()
		{
			var url = '/results';
			if($('#securityusername').val()!= ''){
				url = url + '/' +$('#securityusername').val();
			}
			alert(url);
			$("#securityresults").load(url);
		}